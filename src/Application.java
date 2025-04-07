import service.Database;
import service.EducationService;

public class Application {

    public void main(String[] args) {
        boolean isSave = "save-to-file".equalsIgnoreCase(args.length>0?args[0]:"");
        Database.initialize(isSave);

        while (true) {
            EducationService educationService = EducationService.chooseService(isSave);
            educationService.chooseAndExecuteSelectedMenu();
        }
    }

}
