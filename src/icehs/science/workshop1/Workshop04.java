package icehs.science.workshop1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int americano = getUserInput();
        int americano1 = americano * 2000;
        System.out.println(" �Ƹ޸�ī�� : "+ "��");
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int latte = getUserInput();
        int latte1 = latte * 3000;
        System.out.println(" ī��� : "+ "��");
        System.out.print( " ���̱� �ֹ� ���� : " );
        int bagel = getUserInput();
        int bagel1 = bagel * 1500;
        System.out.println(" ���̱� : "+ "��");
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int creamcheese = getUserInput();
        int creamcheese1  = creamcheese * 500;
        System.out.println(" ũ��ġ�� : "+ "��");
        System.out.println(" =========�ݾ�===========");
        System.out.println();
        
       
        int totalExpanse = 0;
        System.out.println("�� ����� " + totalExpanse +"�� �Դϴ�.");
        
        
    }
    
    public static int getUserInput() {
        
        BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
        String inputString = null;
        
        try {
            inputString = br.readLine();
        } catch ( IOException e ) {
            e.printStackTrace();
        }
        
        return Integer.parseInt( inputString );
    }
}
