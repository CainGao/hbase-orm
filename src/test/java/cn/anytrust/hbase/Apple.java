package cn.anytrust.hbase;

@ORMHBaseTable(tableName="crawldbtest")
public class Apple {
	@ORMHBaseColumn(family="rowkey",qualifier="rowkey")
	private String id;
	@ORMHBaseColumn(family="content",qualifier="conn")
	private String content;
	@ORMHBaseColumn(family="content",qualifier="bytes")
	private byte[] imgs;
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public byte[] getImgs() {
		return imgs;
	}

	public void setImgs(byte[] imgs) {
		this.imgs = imgs;
	}
	
}
