------------------------
Git-命令				|
------------------------
	# 哈哈哈,Linux之父折腾出来的神器
	# 对于学过Linux的少年来说,懂命令行...学GIT命令跟玩儿似得


------------------------
Git-					|
------------------------
	git init --bare [目录名字]
		* 初始化GIT仓库,在当前所在目录中,建立一个指定名称GIT仓库
		* [目录名字],指定的仓库不存在,则会在当前目录新建
	
	git clone [仓库地址] [本地目录]
		* 克隆远程仓库中的数据到本地的目录
		* 会在本地目录中生成一个:.git 的隐藏文件

	git config 
		--system:操作:/etc/gitconfig文件,全局的.对所有用户都生效==系统级别
		--global:操作:~/.gitconfig文件,仅仅对自己生效==用户级别
		缺省:操作仓库:.git/config文件==其实就是当前项目
	
	git config user.name '[用户名]'
	git config user.email '[电子邮箱]'
		# 这个两条命令,会修改本地仓库中的:.git/config文件
		[user]
			name = Kevin
			email = Kevin@qq.com
	
	git add [文件名]
		# 添加文件到版本控制, 其实就是添加到缓存区
	
	git rm [文件名]
		# 从缓存区删除文件

	git commit [文件名] -m "[备注信息]"
		# 提交到本地仓库

	git diff
		# 查看版本区别
	
	git push origin master
		# 提交到中央仓库
		# 你这个仓库是从哪里Clone的?就会提交到哪个仓库
		# 如果是第一次推送:git push -u origin master
		# 加-u参数:Git不但会把本地的master分支内容推送的远程新的master分支，
		# 还会把本地的master分支和远程的master分支关联起来，在以后的推送或者拉取时就可以简化命令。
	
	git pull
		# 从中央仓库更新本地仓库的数据

	git log
		# 显示出版本修改的注释信息
		# 也可以在后面添加指定的文件/或者文件名

	git log --pretty=oneline
		# 以一行,简单的方式显示版本修改的注释信息
		# 显示提交信息
	
	git diff HEAD -- [文件名]
		# 查看指定文件的本地与版本库的区别

	git rm [文件]
		# 删除文件
		# 很显然,你直接rm 文件,那么你还需要add到缓存区再进行提交
		# 这个命令,执行了删除后.直接提交就是了.不用add

	git checkout -- [文件名]
		# '丢弃工作区的修改'
		# 让本地的文件,与版本库保持一直
		# 其实就是放弃修改
		# 总之，就是让这个文件回到最近一次git commit或git add时的状态。
		# --,这个很重要.不然就变成了切换另一个分支的命令
		# 其实是用版本库里的版本替换工作区的版本，无论工作区是修改还是删除，都可以'一键还原'

	git reset HEAD [文件名]
		# '丢弃缓存区的修改'
		# 把一个已经add到缓存区的文件,删除
		# 其实就是把暂存区的修改撤销掉（unstage）,重新放回工作区.

	git cat-file -t [哈希值]
		# 查询指定哈希的对象
		# 哈希值只需要前6位就好了
	
	git cat-file -p [哈希值]
		# 查看指定Hash的tree
		tree 8a6b1008631403888f50eb3f577a75ebfff1a834
		parent a70be54a5cabb4a3ffc95a8af66ae131de74d02c
		author kevin <=> 1470895135 +0800
		committer kevin <=> 1470895135 +0800
	
	git reset --hard HEAD^
		# 退回到上一个版本
		# 多少个:^就表示上N个版本
		# HEAD~100:也可以用数字来表示要退回要以前第N个版本
	
	 git reset --hard [版本Hash前6位]
		# 退回到指定的版本,其实跟上面的命令没太大区别
		# 这东西可以前进,也可以后退
	
	git reflog
		# 用户重返未来,查看确定的版本
		# 查看命令记录,以及对应的版本号
	
