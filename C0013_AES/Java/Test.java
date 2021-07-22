

import java.util.Date;
import java.security.PublicKey;

import java.io.UnsupportedEncodingException;



public class Test {

	
	public static void main(String[] args) {  
	

		doTest("0001");

		System.out.println("--------------------");


		doTest("13000000000");
		

		


	}
	

	
	private static void doTest(String idCard) {
			
		try {  
		
			byte[] desResult = AES.encryptAES(idCard);
			
			System.out.println( "����1�� AES �������ݡ� ��� = " +  MD5Util.getHexString(desResult)  );
			
			
			
			
			String base64Result = Base64Helper.encode(desResult);
			
			
			System.out.println( "����2:  AES ���ܽ���� Base64 ���봦��  ��� = " + base64Result );
			
			
			System.out.println();
			System.out.println("---------------------------------------");
			System.out.println("  �����Ǽ��ܴ���  �����ǽ��ܴ���  ");
			System.out.println("---------------------------------------");
			System.out.println();
			
			
			
			byte[] base64Array = Base64Helper.decode(base64Result);
			
			System.out.println( "����1�� Base64 ���봦��, ��� = " +  MD5Util.getHexString(base64Array)  );
			
			
			
			
			byte[] desResult2 = AES.decryptAES(base64Array);
			
			System.out.println( "����2�� AES �������ݡ� ��� = " +  MD5Util.getHexString(desResult2)  );
			
			
			System.out.println("���ս��ܽ�� = " + new String(desResult2));
			
		} catch (Exception ex) {  
            ex.printStackTrace();  
        } 
		
	}
	
	
		
	
}

