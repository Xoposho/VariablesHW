public class EighthTask {
    public static void main(String[] args) {

        var workingHoursAllEmployee = 640;
        var workingHoursOneEmployee = 8;

        var employeeCount = workingHoursAllEmployee / workingHoursOneEmployee;
        System.out.println("Всего работников в компании: " + employeeCount + " человек.");

        var newbieEmployee = 94;
        employeeCount += newbieEmployee;
        workingHoursAllEmployee = employeeCount * workingHoursOneEmployee;
        System.out.print("Если в компании работает " + employeeCount + " человек, то всего ");
        System.out.println(workingHoursAllEmployee + " часов работы может быть поделено между сотрудниками.");




    }
}
