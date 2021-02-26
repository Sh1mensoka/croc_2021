public class Homework {

    public static void printBytes(double numBytes) {
        int typeOfNum = 0;
        while (numBytes >= 1024) {
            typeOfNum++;
            numBytes /= 1024;
        }
        String result = String.format("%.1f", numBytes).replace(",", ".");
        switch (typeOfNum) {
            case 0:
                System.out.println(result + " B");
                break;
            case 1:
                System.out.println(result + " KB");
                break;
            case 2:
                System.out.println(result + " MB");
                break;
            case 3:
                System.out.println(result + " GB");
                break;
            case 4:
                System.out.println(result + " TB");
                break;
            default:
                System.out.println("Значение больше 1024 TB");
        }
    }

    public static void main(String[] args) {
        printBytes(53692044905543f);
    }
}
