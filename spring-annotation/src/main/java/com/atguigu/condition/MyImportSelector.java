package com.atguigu.condition;

import com.atguigu.bean.Blue;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

//�Զ����߼�������Ҫ��������
public class MyImportSelector implements ImportSelector {

	//����ֵ�����ǵ����뵽�����е����ȫ����
	//AnnotationMetadata:��ǰ��ע@Importע����������ע����Ϣ
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
		//importingClassMetadata
		//������Ҫ����nullֵ
		return new String[]{Blue.class.getName(),"com.atguigu.bean.Yellow"};
	}

}
