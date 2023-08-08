package com.fpt.baithi.repository;

import com.fpt.baithi.entity.DanhSachYT;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DanhSachYTDao extends JpaRepository<DanhSachYT, UUID> {
}
