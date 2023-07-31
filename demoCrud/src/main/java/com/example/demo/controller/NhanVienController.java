package com.example.demo.controller;

import com.example.demo.model.ChucVu;
import com.example.demo.model.NhanVien;
import com.example.demo.service.ChucVuService;
import com.example.demo.service.NhanVienService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class NhanVienController {
    List<NhanVien> listNhanVien = new ArrayList<>();
    List<ChucVu> listChucVu = new ArrayList<>();

    @Autowired
    ChucVuService chucVuService;

    @Autowired
    NhanVienService nhanVienService;

    @RequestMapping("/nhan-vien/hien-thi")
    public String viewHT(Model model) {
        listNhanVien = nhanVienService.getAllNV();
        model.addAttribute("listNhanVien", listNhanVien);
        return "nhan-vien";
    }

    @RequestMapping("/nhan-vien/view-add")
    public String viewAdd(Model model) {
        NhanVien newNhanVien = new NhanVien();
        listChucVu = chucVuService.getAllCV();
        model.addAttribute("viewAdd", newNhanVien);
        model.addAttribute("listChucVu", listChucVu);
        return "view-add";
    }

    @RequestMapping("/nhan-vien/add")
    public String addNhanVien(@Valid @ModelAttribute("viewAdd") NhanVien newNhanVien,
                              BindingResult result, Model model) {
        if (result.hasErrors()) {
            viewAdd(model);
            return "view-add";
        } else {
            nhanVienService.createNV(newNhanVien);
            return "redirect:/nhan-vien/hien-thi";
        }
    }

    // đổ dữ liệu mới lên cbb
    @RequestMapping("/chuc-vu/view-add")
    public String viewAddCBB(Model model) {
        ChucVu newChucVu = new ChucVu();
        model.addAttribute("viewAddCV", newChucVu);
        return "view-addcv";
    }

    @RequestMapping("/chuc-vu/add")
    public String addCBB(@ModelAttribute("viewAddCV") ChucVu newChucVu) {
        chucVuService.addChucVu(newChucVu);
        return "redirect:/nhan-vien/view-add";

    }
}
