//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int radius;
    int side;
    double boxArea;
    double circleArea;
    double area;

    System.out.print("원의 반지름 : ");
    radius = keyboard.nextInt();
    System.out.print("정사각형의 한 변의 길이 : ");
    side = keyboard.nextInt();

    boxArea = side * side;
    circleArea = radius * radius * Math.PI;
    area = boxArea - circleArea;

    System.out.printf("\n정사각형 면적 : %.0f ㎠\n", boxArea);
    System.out.printf("원의 면적 : %.2f ㎠\n", circleArea);
    System.out.printf("구하는 면적 : %.2f ㎠\n", area);
}
