package softlab.shop.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import softlab.shop.entities.AddFile;
import softlab.shop.repositories.AddFileRepository;

import java.io.IOException;
import java.util.List;
@Service
@AllArgsConstructor
public class AddFileService {
    private AddFileRepository addFileRepository;
    public void saveAddFilesToDatabase(MultipartFile file) {
        if (ExselUploadService.isValidExcelFile(file)) {
            try {
                List<AddFile> addFiles = ExselUploadService.getAddFIlesDataFromExcel(file.getInputStream());
                this.addFileRepository.saveAll(addFiles);
            } catch (IOException e) {
                try {
                    throw new IllegalArgumentException("The file is not a valide excel file");
                } catch (IllegalArgumentException ex) {
                    throw new RuntimeException(ex);
                }
            }

        }
    }
    public List<AddFile> getAddfiles(){
        return  addFileRepository.findAll();
    }
}
