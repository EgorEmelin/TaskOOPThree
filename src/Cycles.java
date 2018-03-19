public class Cycles {

    public void cycles(int size) {

        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= size; i++) {
            for (int j = size; j >= i; j--) {
                System.out.print("# ");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i > 1) && (j < i)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i < size) && (j <= size - i)){
                    System.out.print("  ");
                }
                else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i == 1) || (i == size) ||
                        (j == size) || (j == 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i == 1) || (i == size) ||
                        (i == j)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i == 1) || (i == size) ||
                        (i == size - j + 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i == 1) || (i == size) ||
                        (i == size - j + 1) || (i == j)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <=size; i++) {
            for (int j = 1; j <=size; j++) {
                if ((i == 1) || (i == size) ||
                        (i == size - j + 1) ||
                        (i == j) || (j == size) ||
                        (j == 1)){
                    System.out.print("# ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
