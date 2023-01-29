import ru.netology.sqr.javaqa.HomeWorkJavamvn5.SQRService;
public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int rangeStart = 200;
        int rangeFinish = 300;
        int count = service.calcSQR( rangeStart, rangeFinish);

        System.out.println(" Количество квадратов в диапазоне от " + rangeStart + " до " + rangeFinish + " равно " + count);
    }
}
