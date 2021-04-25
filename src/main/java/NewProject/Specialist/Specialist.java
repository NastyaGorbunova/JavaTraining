package NewProject.Specialist;

public class Specialist {
    private int baseSalary = 100;
    private double salaryRate;
    private int specialistCount;


    public int getSpecialistCount() {
        return specialistCount;
    }

    public void setSpecialistCount(int specialistCount) {
        this.specialistCount = specialistCount;
    }

    public double getSalaryRate() {
        return salaryRate;
    }

    public void setSalaryRate(double salaryRate) {
        this.salaryRate = salaryRate;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
}
