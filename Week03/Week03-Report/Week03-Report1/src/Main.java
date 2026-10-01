//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int a;
    int b;
    int result;

    System.out.print("첫번째 숫자를 입력하세요 ");
    a = keyboard.nextInt();
    System.out.print("두번째 숫자를 입력하세요 ");
    b = keyboard.nextInt();

    result = a + b;

    System.out.printf("%d + %d = %d", a, b, result);
}
