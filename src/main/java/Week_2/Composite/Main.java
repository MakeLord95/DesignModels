package Week_2.Composite;

public class Main {
    public static void main(String[] args) {
        Component ram = new IndividualComponent("RAM Kit", 149.99);
        Component cpu = new IndividualComponent("CPU", 449.99);
        Component nvme = new IndividualComponent("NvME SSD", 199.99);
        Component gpu = new IndividualComponent("GPU", 749.99);
        Component psu = new IndividualComponent("PSU", 299.99);
        Component aio = new IndividualComponent("AIO", 149.99);
        Component caseFan = new IndividualComponent("Case Fan", 19.99);

        Component motherboard = new CompositeComponent("Motherboard", 349.99, ram, cpu, nvme, gpu, aio);
        Component computerCase = new CompositeComponent("PC Case", 109.99, motherboard, psu, caseFan, caseFan, caseFan);

        System.out.println(computerCase);
        System.out.printf("Total price: $%.2f €\n", computerCase.getPrice());
    }
}
