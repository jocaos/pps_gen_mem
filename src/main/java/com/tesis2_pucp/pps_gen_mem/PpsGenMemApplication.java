package com.tesis2_pucp.pps_gen_mem;

import com.tesis2_pucp.pps_gen_mem.service.FilesStorageService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class PpsGenMemApplication implements CommandLineRunner {
    @Resource
    FilesStorageService storageService;

    public static void main(String[] args) {
        SpringApplication.run(PpsGenMemApplication.class, args);
    }

    @Override
    public void run(String... arg) {
        storageService.deleteAll();
        storageService.init();
    }


}
