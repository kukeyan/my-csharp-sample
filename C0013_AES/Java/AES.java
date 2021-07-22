
import java.security.SecureRandom;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.SecretKeyFactory;
import javax.crypto.SecretKey;
import javax.crypto.Cipher;


public class AES {
	
	
	public AES() {
	}
	
	
    private static final String key="1234567890123456";
    private static final String initVector  ="1234567890123456";
	
	
	//����
	public static void main(String args[]) {

		System.out.println("key��" + key);
		System.out.println("iv��"+ initVector );


		//ֱ�ӽ��������ݽ���
		try {
		
			//����������
			String str = "��������";
			

			byte[] result = AES.encryptAES(str);
			
			System.out.println("���ܺ�"+new String(result));


			byte[] decryResult = AES.decryptAES(result);
			System.out.println("���ܺ�"+new String(decryResult));
		} catch (Exception e1) {
			e1.printStackTrace();
		}

	}

	

	
	// ����
    public static byte[] encryptAES(String data) throws Exception {
        try {
			
			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
	 
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);
	 
			byte[] encrypted = cipher.doFinal(data.getBytes());

            return encrypted;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // ����
    public static byte[] decryptAES(byte[] encrypted1) throws Exception {
        try
        {

			IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
			SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
 
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
			cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);
			byte[] original = cipher.doFinal(encrypted1);

            
            return original;
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }	
	
	
	
	
	
	
}