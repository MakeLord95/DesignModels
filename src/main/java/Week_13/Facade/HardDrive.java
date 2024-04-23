package Week_13.Facade;

class HardDrive {
    public char[] read(long lba, int size) {
        System.out.printf("Hard Drive: Reading data from LBA %s with size %s\n", lba, size);

        return new char[size];
    }
}
