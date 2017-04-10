package ustc.maomao.patterns.builder;

/**
 * @author Keene. Mail: waterzhj@ustc.edu.cn
 * 
 *         该代码遵循MIT License, 详细见 https://mit-license.org/
 * 
 *         Copyright {2017} {Keene}
 * 
 *         designed by Keene, implemented by {Keene}
 * 
 *         JSON文本构造器
 * 
 */
public class JSONBuilder implements TextBuilder {

	private JSONText json;// json文本对象
	private String jsonElement;

	public JSONBuilder() {
		json = new JSONText();
	}

	/**
	 * @return 构造的json文本
	 */
	public String getJsonText() {
		return json.getText();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.builder.TextBuilder#convertmType(int)
	 */
	@Override
	public void convertmType(int mType) {
		jsonElement="{\"MType\":\""+mType+"\"";
		jsonElement+=",";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * ustc.maomao.patterns.builder.TextBuilder#convertmName(java.lang.String)
	 */
	@Override
	public void convertmName(String mName) {
		jsonElement="\"MName\":\""+mName+"\"";
		jsonElement+=",";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ustc.maomao.patterns.builder.TextBuilder#convertmPrice(float)
	 */
	@Override
	public void convertmPrice(float mPrice) {
		jsonElement="\"MPrice\":\""+mPrice+"\"}";
		json.add(jsonElement);
	}

}