package TestPrototype;

import java.io.*;


/*
*
* 一个对象序列化的接口，一个类只有实现了Serializable接口
*它的对象才是可序列化的。因此如果要序列化某些类的对象，
* 这些类就必须实现Serializable接口。而实际上，Serializable是一个空接口
* 没有什么具体内容，它的目的只是简单的标识一个类的对象可以被序列化。
 什么情况下需要序列化：
 1.     当你想把的内存中的对象写入到硬盘的时候。
 2.     当你想用套接字在网络上传送对象的时候。
 3.     当你想通过RMI传输对象的时候。
* */
public class DeepAndShadow implements Cloneable,Serializable {

    private static final long serivalVersionUID=1L;

    private String string;

    private SerializableObject obj;

    /* 浅复制 */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }
    /* 深复制 */
    public Object deepClone() throws IOException, ClassNotFoundException {

        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public SerializableObject getObj() {
        return obj;
    }

    public void setObj(SerializableObject obj) {
        this.obj = obj;
    }

}
class SerializableObject implements Serializable {
    private static final long serialVersionUID = 1L;
}
