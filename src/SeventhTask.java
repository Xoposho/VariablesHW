public class SeventhTask {
    public static void main(String[] args) {

        var weightFirstFighter = 78.2;
        var weightSecondFighter = 82.7;

        var weightDifferenceVariantOne = weightSecondFighter - weightFirstFighter;
        System.out.println("Разница в весе составляет: " + Math.abs(weightDifferenceVariantOne));

        var weightDifferenceVariantTwo = weightSecondFighter % weightFirstFighter;
        System.out.println("Разница в весе составляет: " + Math.abs(weightDifferenceVariantTwo));


    }
}
