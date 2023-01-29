package ru.netology.sqr.javaqa.HomeWorkJavamvn5;
public class SQRService {
    public int calcSQR (int ransgeStart, int rangeFinish) {

        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int x = i *i;
            if (x >= ransgeStart) {
                if (x <= rangeFinish) {
                    count++;
                }
            }
        }
        return count;
    }

}

