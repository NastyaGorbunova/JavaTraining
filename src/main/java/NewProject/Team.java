package NewProject;

import NewProject.Specialist.Junior;
import NewProject.Specialist.Middle;
import NewProject.Specialist.Senior;

public class Team {
    Junior junior;
    Middle middle;
    Senior senior;
    public Team(){
        junior = new Junior(ProjectMoney.randomCount(5,20));
        middle = new Middle(ProjectMoney.randomCount(10,30));
        senior = new Senior(ProjectMoney.randomCount(1,5));
    }

    public double finalSum (int projectTime){
        double juniorDaySalary = junior.getSpecialistCount()* junior.getBaseSalary()* junior.getSalaryRate();
        double middleDaySalary = middle.getSalaryRate()* middle.getBaseSalary()* middle.getSpecialistCount();
        double seniorDaySalary = senior.getBaseSalary()* senior.getSpecialistCount()* senior.getSalaryRate();
        final int weekDays = 7;

        return projectTime * weekDays * (juniorDaySalary+middleDaySalary+seniorDaySalary);
    }

}
