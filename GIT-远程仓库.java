------------------------
GIT-Զ�ֿ̲�			|
------------------------
	git remote add origin git@github.com:XXXXXXXX/XXXXXX.git
		# �ñ��زֿ���Զ�ֿ̲����
		# �Ϳ���ͬ������Զ�ֿ̲��ϵĴ���
		# �����Ҫ����,��ô�ͱ���Ҫע��:"ssh"��Կ

	ssh-keygen -t rsa -C "youremail@example.com"
		# ����shh-key
		# ����~/.ssh ����һ������pub���ļ�,������ǹ�Կ

	
	git clone [�ֿ��ַ] [����Ŀ¼]
		* ��¡Զ�ֿ̲��е����ݵ����ص�Ŀ¼
		* ���ڱ���Ŀ¼������һ��:.git �������ļ�
	
	git push origin master
		# �ύ������ֿ�
		# ������ֿ��Ǵ�����Clone��?�ͻ��ύ���ĸ��ֿ�
		# ����ǵ�һ������:git push -u origin master
		# ��-u����:Git������ѱ��ص�master��֧�������͵�Զ���µ�master��֧��
		# ����ѱ��ص�master��֧��Զ�̵�master��֧�������������Ժ�����ͻ�����ȡʱ�Ϳ��Լ����
	
	git pull
		# ������ֿ���±��زֿ������
	

	Ҫ����һ��Զ�̿⣬ʹ������git remote add origin git@github.com:KevinBlandy/spring-boot-dynamicDatasource.git
	������ʹ������git push -u origin master��һ������master��֧���������ݣ�
	�˺�ÿ�α����ύ��ֻҪ�б�Ҫ���Ϳ���ʹ������git push origin master���������޸ģ�