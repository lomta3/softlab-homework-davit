package softlab.shop.service;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import softlab.shop.entities.AddFile;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ExselUploadService {
    public static Boolean isValidExcelFile(MultipartFile file) {
        return Objects.equals(file.getContentType(), "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
    }

    public static List<AddFile> getAddFIlesDataFromExcel(InputStream inputStream) throws IOException {
        List<AddFile> addFiles = new ArrayList<>();

        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("addFiles");

            int rowIndex = 0;
            AddFile addFile = null;
            for (Row row : sheet) {
                if (rowIndex == 0) {
                    rowIndex++;
                    continue;
                }
                Iterator<Cell> cellIterator = row.iterator();
                int cellIndex = 0;
                addFile = new AddFile();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cellIndex) {
                        case 0 -> addFile.setLatitude(cell.getNumericCellValue());
                        case 1 -> addFile.setLongitude(cell.getNumericCellValue());
                        case 2 -> addFile.setName(cell.getStringCellValue());
                        default -> {
                        }
                    }
                    cellIndex++;
                }
                addFiles.add(addFile);
            }

            } catch(IOException e){
                e.getStackTrace();
            }
            return addFiles;
        }
    }
