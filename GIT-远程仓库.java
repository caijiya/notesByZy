------------------------
GIT-远程仓库			|
------------------------
	git remote add origin git@github.com:XXXXXXXX/XXXXXX.git
		# 让本地仓库与远程仓库关联
		# 就可以同步下来远程仓库上的代码
		# 如果需要推送,那么就必须要注意:"ssh"公钥

	ssh-keygen -t rsa -C "youremail@example.com"
		# 创建shh-key
		# 会在~/.ssh 生成一个带有pub的文件,里面就是公钥

	
	git clone [仓库地址] [本地目录]
		* 克隆远程仓库中的数据到本地的目录
		* 会在本地目录中生成一个:.git 的隐藏文件
	
	git push origin master
		# 提交到中央仓库
		# 你这个仓库是从哪里Clone的?就会提交到哪个仓库
		# 如果是第一次推送:git push -u origin master
		# 加-u参数:Git不但会把本地的master分支内容推送的远程新的master分支，
		# 还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令。
	
	git pull
		# 从中央仓库更新本地仓库的数据
	

	要关联一个远程库，使用命令git remote add origin git@github.com:KevinBlandy/spring-boot-dynamicDatasource.git
	关联后，使用命令git push -u origin master第一次推送master分支的所有内容；
	此后，每次本地提交后，只要有必要，就可以使用命令git push origin master推送最新修改；