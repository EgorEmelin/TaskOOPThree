public class ControlStructures {
    enum Numbers { ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ELEVEN, TWELVE, THIRTEEN, FOURTEEN, FIFTEEN }

    public void enumeration(Numbers number){

        long startTime = System.nanoTime();
        switch (number) {
            case ONE:
                System.out.println(Numbers.ONE);
                break;
            case TWO:
                System.out.println(Numbers.TWO);
                break;
            case THREE:
                System.out.println(Numbers.THREE);
                break;
            case FOUR:
                System.out.println(Numbers.FOUR);
                break;
            case FIVE:
                System.out.println(Numbers.FIVE);
                break;
            case SIX:
                System.out.println(Numbers.SIX);
                break;
            case SEVEN:
                System.out.println(Numbers.SEVEN);
                break;
            case EIGHT:
                System.out.println(Numbers.EIGHT);
                break;
            case NINE:
                System.out.println(Numbers.NINE);
                break;
            case TEN:
                System.out.println(Numbers.TEN);
                break;
            case ELEVEN:
                System.out.println(Numbers.ELEVEN);
                break;
            case TWELVE:
                System.out.println(Numbers.TWELVE);
                break;
            case THIRTEEN:
                System.out.println(Numbers.THIRTEEN);
                break;
            case FOURTEEN:
                System.out.println(Numbers.FOURTEEN);
                break;
            case FIFTEEN:
                System.out.println(Numbers.FIFTEEN);
                break;
                default:
                    System.out.println("None of enum");
        }
        long finalTime = System.nanoTime() - startTime;
        System.out.println(finalTime + "\n");
        startTime = System.nanoTime();
        if (number == Numbers.ONE) System.out.println(Numbers.ONE);
        else if (number == Numbers.TWO) System.out.println(Numbers.TWO);
        else if (number == Numbers.THREE) System.out.println(Numbers.THREE);
        else if (number == Numbers.FOUR) System.out.println(Numbers.FOUR);
        else if (number == Numbers.FIVE) System.out.println(Numbers.FIVE);
        else if (number == Numbers.SIX) System.out.println(Numbers.SIX);
        else if (number == Numbers.SEVEN) System.out.println(Numbers.SEVEN);
        else if (number == Numbers.EIGHT) System.out.println(Numbers.EIGHT);
        else if (number == Numbers.NINE) System.out.println(Numbers.NINE);
        else if (number == Numbers.TEN) System.out.println(Numbers.TEN);
        else if (number == Numbers.ELEVEN) System.out.println(Numbers.ELEVEN);
        else if (number == Numbers.TWELVE) System.out.println(Numbers.TWELVE);
        else if (number == Numbers.THIRTEEN) System.out.println(Numbers.THIRTEEN);
        else if (number == Numbers.FOURTEEN) System.out.println(Numbers.FOURTEEN);
        else if (number == Numbers.FIFTEEN) System.out.println(Numbers.FIFTEEN);
        else System.out.println("None of enum");
        finalTime = System.nanoTime() - startTime;
        System.out.println(finalTime + "\n");
    }

    public void array() {
        int[] array = new int[50];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 14);
        }
        // Для чистоты измерения времени, конструкции будут в отдельных циклах
        int count[] = new int[15];
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 1:
                    count[0]++;
                    break;
                case 2:
                    count[1]++;
                    break;
                case 3:
                    count[2]++;
                    break;
                case 4:
                    count[3]++;
                    break;
                case 5:
                    count[4]++;
                    break;
                case 6:
                    count[5]++;
                    break;
                case 7:
                    count[6]++;
                    break;
                case 8:
                    count[7]++;
                    break;
                case 9:
                    count[8]++;
                    break;
                case 10:
                    count[9]++;
                    break;
                case 11:
                    count[10]++;
                    break;
                case 12:
                    count[11]++;
                    break;
                case 13:
                    count[12]++;
                    break;
                case 14:
                    count[13]++;
                    break;
                case 15:
                    count[14]++;
                    break;
            }
        }
        long finalTime = System.nanoTime()-startTime;
        System.out.println("Time: " +finalTime + "\n");
        System.out.println(" 1: (" + count[0] + ") 2: (" + count[1] +
                ") 3: (" + count[2] + ") 4: (" + count[3] +
                ") 5: (" + count[4] + ") 6: (" + count[5] +
                ") 7: (" + count[6] + ") 8: (" + count[7] +
                ") 9: (" + count[8] + ") 10: (" + count[9] +
                ") 11: (" + count[10] + ") 12: (" + count[11] +
                ") 13: (" + count[12] + ") 14: (" + count[13] +
                ") 15: (" + count[14] + ")\n" );

        int count1[] = new int[15];
        startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) count1[0]++;
            else if (array[i] == 2) count1[1]++;
            else if (array[i] == 3) count1[2]++;
            else if (array[i] == 4) count1[3]++;
            else if (array[i] == 5) count1[4]++;
            else if (array[i] == 6) count1[5]++;
            else if (array[i] == 7) count1[6]++;
            else if (array[i] == 8) count1[7]++;
            else if (array[i] == 9) count1[8]++;
            else if (array[i] == 10) count1[9]++;
            else if (array[i] == 11) count1[10]++;
            else if (array[i] == 12) count1[11]++;
            else if (array[i] == 13) count1[12]++;
            else if (array[i] == 14) count1[13]++;
            else if (array[i] == 15) count1[14]++;
        }
        finalTime = System.nanoTime()-startTime;
        System.out.println("Time: " +finalTime + "\n");
        System.out.println(" 1: (" + count1[0] + ") 2: (" + count1[1] +
                ") 3: (" + count1[2] + ") 4: (" + count1[3] +
                ") 5: (" + count1[4] + ") 6: (" + count1[5] +
                ") 7: (" + count1[6] + ") 8: (" + count1[7] +
                ") 9: (" + count1[8] + ") 10: (" + count1[9] +
                ") 11: (" + count1[10] + ") 12: (" + count1[11] +
                ") 13: (" + count1[12] + ") 14: (" + count1[13] +
                ") 15: (" + count1[14] + ")");
    }
}
