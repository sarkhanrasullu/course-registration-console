import service.EducationService;

public class Application {
    public void main2(String[] args) {
        while (true) {

            EducationService educationService = EducationService.chooseService();

            educationService.chooseAndExecuteSelectedMenu();
        }
    }

}
