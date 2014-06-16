package test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javax.servlet.ServletOutputStream;

import analysis.DockingAnalyzer;
import analysis.attribute.Attr;
import analysis.attribute.DataAttribute;
import analysis.filter.FileReaderFilter;
import analysis.filter.FileUnzipFilter;
import analysis.register.FilePathRegister;

public class TestMain {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		String filePath = "C:\\test\\doc_write.zip";

		DockingAnalyzer ds = new FileUnzipFilter(new FilePathRegister(filePath));
		ds.analyze();

		DataAttribute dAttr = (DataAttribute) ds.getAttrSet().get(Attr.ATTRSET_FILE_DATA);

		byte[][] type = dAttr.getType();
		byte[][] data = dAttr.getData();

		byte[] buffer = new byte[1024];

		try {
			String path = "C:\\test\\doc_write.png"; // �׸� ���� ��ġ �ľ�.
			File file = new File(path);
			// �׸� ������ �б� ���� ��ü ����.
			BufferedInputStream in = new BufferedInputStream(new FileInputStream(file)); 
			int n = 0;

			// ���� ������ �а�, �̰��� ServletOutputStream�� ���ؼ� ���. 
			while((n=in.read(buffer)) != -1) {
				for(int i=0;i<data[0].length;i++){
					System.out.println(data[0][i] + " / " + buffer[i]);
				}
			}

			in.close();
		}catch(Exception e) {}
	}

}
