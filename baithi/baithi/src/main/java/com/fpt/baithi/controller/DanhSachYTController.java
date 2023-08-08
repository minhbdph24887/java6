package com.fpt.baithi.controller;


import com.fpt.baithi.entity.DanhSachYT;
import com.fpt.baithi.entity.KhachHang;
import com.fpt.baithi.repository.DanhSachYTDao;
import com.fpt.baithi.repository.KhachHangDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Controller
public class DanhSachYTController {

    @Autowired
    DanhSachYTDao danhSachYTDao;
    @Autowired
    KhachHangDao khachHangDao;

    @GetMapping("/danh-sach-yeu-thich/hien-thi")
    public String hienThi(Model model, @RequestParam("p")Optional<Integer> p){

        Pageable pageable = PageRequest.of(p.orElse(0),5);
        Page<DanhSachYT> page = danhSachYTDao.findAll(pageable);
        model.addAttribute("DSYT", page);

        return "/index";
    }
    @GetMapping("/danh-sach-yeu-thich/delete/{madanhsach}")
    public String delete(Model model , @PathVariable("madanhsach")UUID ma){
        danhSachYTDao.deleteById(ma);
        return "redirect:/danh-sach-yeu-thich/hien-thi";
    }
    @GetMapping("/danh-sach-yeu-thich/view-add")
    public String viewAdd(Model model){
        List<KhachHang> khachHangs = khachHangDao.findAll();
        model.addAttribute("khachhang",khachHangs);
        return "/viewAdd";
    }

    @PostMapping("/danh-sach-yeu-thich/add")
    public String add(Model model ,
                      @RequestParam("ghichu") String ghichu,
                      @RequestParam("khachhang") String khachhangma,
                      @RequestParam("trangthai") Long trangthai
                      ){

        if (ghichu.isEmpty()){
            model.addAttribute("erro","Không được bỏ trống ghi chú!");
            List<KhachHang> khachHangs = khachHangDao.findAll();
            model.addAttribute("khachhang",khachHangs);
            return "/viewAdd";
        }

        DanhSachYT ds = new DanhSachYT();
        KhachHang khachHang = khachHangDao.getReferenceById(Long.valueOf(khachhangma));
        ds.setMadanhsach(UUID.randomUUID());
        ds.setGhichu(ghichu);
        ds.setKhachHang(khachHang);
        ds.setTrangthai(trangthai);
        danhSachYTDao.save(ds);
        return "redirect:/danh-sach-yeu-thich/hien-thi";
    }
}
