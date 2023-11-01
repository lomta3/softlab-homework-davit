package softlab.shop.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import jakarta.persistence.Entity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import softlab.shop.entities.AddFile;
import softlab.shop.service.AddFileService;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("addFiles")
public class AddFileController {

    private AddFileService addFileService;
    @PostMapping("/upload-Addfiles")
    public ResponseEntity<?> uploadAddFiles(@RequestParam("file")MultipartFile file) {
        this.addFileService.saveAddFilesToDatabase(file);
        return ResponseEntity.ok(Map.of("Message", "AddFiles date upload and saved to database successfully"));
    }
@GetMapping
    public ResponseEntity<List<AddFile>>getAddfiles(){
        return new ResponseEntity<>(addFileService.getAddfiles(),HttpStatus.FOUND);
    }
}
