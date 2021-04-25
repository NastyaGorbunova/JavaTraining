package NewProject;

import java.util.Random;

public class ProjectMoney {

    public static void main(String[] args) {
        int projectTime = randomCount(20,60);

        Team team = new Team();
        System.out.printf("Need Money: %s\n", team.finalSum(projectTime));
        System.out.printf("Project Length (week): %s\n", projectTime);
        System.out.printf("Need Specialists: %s (%s juniors, %s middles, %s seniors) \n",
                team.junior.getSpecialistCount()+team.middle.getSpecialistCount()+team.senior.getSpecialistCount(),
                team.junior.getSpecialistCount(), team.middle.getSpecialistCount(), team.senior.getSpecialistCount());
    }

    public static int randomCount(int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

}
