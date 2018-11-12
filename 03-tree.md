# 03-tree

## 第三讲 树
[返回主目录](../README.md)

### 1.树的定义
树(Tree)是n(n>=0)个结点的有限集。当n=0时成为空树，在任意一棵非空树中：

有且仅有一个特定的称为根(Root)的结点；

当n>1时，其余结点可分为m(m>0)个互不相交的有限集T1、T2、...、Tm，其中每一个集合本身又是一棵树，并且称为根的子树(SubTree)。
![](src/main/resources/images/03-Tree.png)

#### 1.1 结点分类
每一个圈圈我们就称为树的一个结点。结点拥有的子树数称为结点的度-(Degree)，树的度取树内各结点的度的最大值。

度为0的结点称为叶结点(Leaf)或终端结点；

度不为0的结点称为分支结点或非终端结点，除根结点外，分支结点也称为内部结点。
![](src/main/resources/images/03-DegreeAndNode.png)

#### 1.2 结点间的关系
结点的子树的根称为结点的孩子(Child)，相应的，该结点称为孩子的双亲(Parent)，同一双亲的孩子之间互称为兄弟(Sibling)。

结点的祖先是从根到该结点所经分支上的所有结点。

#### 1.3 结点的层次
结点的层次(Level)从根开始定一起，根为第一层，根的孩子为第二层。

其双亲在同一层的结点互为堂兄弟。

树中结点的最大层次称为树的深度(Depth)或高度。
![](src/main/resources/images/03-LevelAndDepth.png)

### 2.树的存储结构

#### 2.1 双亲表示法
![](src/main/resources/images/03-Parents.png)

#### 2.2 孩子表示法
![](src/main/resources/images/03-Children.png)

#### 2.3 双亲孩子表示法
![](src/main/resources/images/03-ParentsAndChildren.png)

### 3.二叉树

#### 3.1 二叉树的定义
二叉树（Binary Tree）是n（n>=0）个结点的有限集合，该集合或者为空集（空二叉树），或者由一个根结点和两棵互不相交的、分别称为根结点的左子树和右子树的二叉树组成。

#### 3.2 二叉树的五种基本形态

空二叉树

![](src/main/resources/images/03-BinaryTree1.png)

只有一个根结点

![](src/main/resources/images/03-BinaryTree2.png)

根结点只有左子树

![](src/main/resources/images/03-BinaryTree3.png)

根结点只有右子树

![](src/main/resources/images/03-BinaryTree4.png)

根结点既有左子树又有右子树

![](src/main/resources/images/03-BinaryTree5.png)

#### 3.3 二叉链表
```cfml
typedef struct BiTNode
{
ElemType data;
struct BiTNode *lchild, *rchild;
} BiTNode, *BiTree;
```

#### 3.4 二叉树的遍历


