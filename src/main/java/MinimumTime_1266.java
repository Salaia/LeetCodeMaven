/*
    Когда у меня пошло за лимит времени, я подумала, что надо как-то не шаги считать, а вычитать координаты,
    но голова в сторону математики сейчас вообще не варит. Так что пошла в солюшен.

    Идея в чем. Из точки 1:1 в точку 3:4
    Диагональ по очкам равна горизонтали/вертикали,
    поэтому проход по меньшей стороне можно игнорировать
    Так что смотрим, где больше разница, ее и прибавляем
    (ну и не забываем откинуть возможный минус, у нас же координаты могут быть отрицательными,
    а пройденный путь - только положительным)
 */

public class MinimumTime_1266 {
    // мой вариант вылетел за TimeLimit, должно быть так:
    // time+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));


    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length == 1) return 0;
        int seconds = 0;

        for (int i = 0; i < points.length-1; i++) {
            while (points[i][0] != points[i+1][0] ||
            points[i][1] != points[i+1][1]) {
                if (points[i][0] > points[i+1][0] &&
                        points[i][1] > points[i+1][1]) {
                    seconds++;
                    points[i][0]--;
                    points[i][1]--;
                } else if (points[i][0] < points[i+1][0] &&
                        points[i][1] < points[i+1][1]){
                    seconds++;
                    points[i][0]++;
                    points[i][1]++;
                } else if (points[i][0] == points[i+1][0] &&
                        points[i][1] < points[i+1][1]){
                    seconds++;
                    points[i][1]++;
                } else if (points[i][0] < points[i+1][0] &&
                        points[i][1] == points[i+1][1]){
                    seconds++;
                    points[i][0]++;
                } else if (points[i][0] == points[i+1][0] &&
                        points[i][1] > points[i+1][1]){
                    seconds++;
                    points[i][1]--;
                } else if (points[i][0] > points[i+1][0] &&
                        points[i][1] == points[i+1][1]){
                    seconds++;
                    points[i][0]--;
                }
            }
        }

        return seconds;
    }
}
