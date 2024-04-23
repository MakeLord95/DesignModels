package Week_13.Facade;

public class ComputerFacade {
    private static final long BOOT_ADDRESS = 0x100;
    private static final long BOOT_SECTOR = 0x1;
    private static final int SECTOR_SIZE = 512;

    private final CPU cpu;
    private final Memory memory;
    private final HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        char[] bootData = hardDrive.read(BOOT_SECTOR, SECTOR_SIZE);
        memory.load(BOOT_ADDRESS, bootData);
        cpu.jump(BOOT_ADDRESS);
        cpu.execute();
    }

}
