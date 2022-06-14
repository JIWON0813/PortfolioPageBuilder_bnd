package com.example.portfoliopagebuilder_bnd.file.controller;

import com.example.portfoliopagebuilder_bnd.file.dto.FileDetail;
import com.example.portfoliopagebuilder_bnd.file.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(value = "/upload", produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class FileController {
        private final FileService fileService;

        @PostMapping
        public ResponseEntity<FileDetail> post(
                @RequestPart("file") MultipartFile multipartFile) {
            return ResponseEntity.ok(fileService.save(multipartFile));
        }

    }
