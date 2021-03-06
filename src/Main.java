import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArraysSort arraysSort = new ArraysSort();
        /*
        * Сложность сортировки пузырьком n^2, выбором в худшем случае n^2-1, sort реализует быструю сортировку со сложностью n*logn
        * Но при выполненении сортировки можно заметить что при установки небольших значений size сортировка выбором закономерно быстрее пузырька, но
        * sort значительно медленнее. Но при установки больших значений (например от 1000) sort становится значительно быстрее первых двух.
        * Могу предположить, что это происходит из - за серии переходов между методами, заложенных в реализации sort, что делает его использование невыгодным для
        * массивов малых размеров.
         */
        arraysSort.sort(20,-50,100);

        Factorial factorial = new Factorial();
        /*
        * Очевидно, что вычисление факториала в цикле более быстро по сравнению с рекурсией так как в последнем случае нам необходимо
        * множество раз вызывать метод и держать результаты в памяти, пока не дойдем до конца и не схлопнем все вызовы.
         */
        factorial.factorial(10);

        Cycles cycles = new Cycles();
        cycles.cycles(7);

        ArraysTasks arraysTasks =new ArraysTasks();
        arraysTasks.evenArray();
        arraysTasks.randomArray();
        arraysTasks.changeArray(); // Здесь происходит замена из учета, что индексация начинается с 0,
                                   // поэтому визуально получается, что четные заменены. В задании не очевидно что считать началом индексации.
        arraysTasks.minMaxArray();
        arraysTasks.averageArray();

        arraysTasks.searchArray(); // Поставил диапазон от -10 до 10, так как если тип double или float, то при количестве знаков после запятой после больше 7,
                                   // шанс совпадения стремится к нулю в диапазоне от -1 до 1. Если же int, то в подавляющем большинстве случаев весь массив нулей.

        MatrixTasks matrixTasks = new MatrixTasks();
        matrixTasks.matrixSum();
        matrixTasks.matrixMax(); // Для более быстрого визуального поиска, все индексы увеличины на 1, чтобы они показывали номер элемента от 1 а не 0
        matrixTasks.matrixMaxRow(); // Для более быстрого визуального поиска, все индексы увеличины на 1, чтобы они показывали номер элемента от 1 а не 0
        matrixTasks.matrixSort();

        ControlStructures controlStructures = new ControlStructures();
        controlStructures.enumeration(ControlStructures.Numbers.FIFTEEN);
        controlStructures.array(); // Из результатов можно увидеть, что для примитивных типов switch работает быстрее, чам else if. Скорее всего это можно объяснить тем, что в switch
                                   // при захождении в case происходит break и мы выходим из switch, а в else if мы в любом случае проходим все проверки.
                                   // Но при перечислениях ситуация совершенно обратная. Если честно я не очень уверен почему так, могу предположить, что это из-за особенностей проверки условий
                                   // при работе с перечислениями. Можно оставить коментарий по этому моменту, что здесь происходит?

    }
}
