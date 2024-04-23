package Week_13.Facade;

class CPU {
    public void freeze() {
        System.out.println("CPU: Freezing CPU...");
    }

    public void jump(long position) {
        System.out.printf("CPU: Jumping to position %s\n", position);
    }

    public void execute() {
        System.out.println("CPU: Executing instructions...");
    }
}
