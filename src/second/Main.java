package second;

import java.util.Scanner;

//백준 2839번 설탕물

//상근이는 요즘 설탕공장에서 설탕을 배달하고 있다. 상근이는 지금 사탕가게에 설탕을 정확하게 N킬로그램을 배달해야 한다. 설탕공장에서 만드는 설탕은 봉지에 담겨져 있다. 봉지는 3킬로그램 봉지와 5킬로그램 봉지가 있다.

//상근이는 귀찮기 때문에, 최대한 적은 봉지를 들고 가려고 한다. 예를 들어, 18킬로그램 설탕을 배달해야 할 때, 3킬로그램 봉지 6개를 가져가도 되지만, 5킬로그램 3개와 3킬로그램 1개를 배달하면, 더 적은 개수의 봉지를 배달할 수 있다.

//상근이가 설탕을 정확하게 N킬로그램 배달해야 할 때, 봉지 몇 개를 가져가면 되는지 그 수를 구하는 프로그램을 작성하시오.
public class Main {

	
	
	public static void main(String[] args) {
		
		
    Scanner sc = new Scanner(System.in);
    //N은 설탕의 양
    int N = sc.nextInt();
    //bong은 설탕 봉지 갯수
    int bong = 0;
    
    while(true) {
    	//5의 배수이면
    	if(N%5==0) {
    		//설탕 봉지 개수를 bong에 넣어줌
    		bong += N/5;
    		System.out.println(bong);
    		break;
    		
    	}else {
    		//5의 배수가 아니면 설탕양에 3을 빼주고 봉지를 1개 +(반복 ex->27개면 -3이 9개가 되겠지? 봉지 9개(3kg 짜리)
    		N -= 3;
    		bong++;
    		
    	}
    	
    	if(N<0) {
    		
    		System.out.println("-1");
    		break;
    		
    	}
    	
    	
    	
    	
    	
    }
		
		
	}
}