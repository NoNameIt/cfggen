package cfg.cmd.action;
public final class Currencys extends cfg.cmd.action.Bonus {
	public final static int TYPEID = 214530600;
	final public int getTypeId() { return TYPEID; }
	public final java.util.List<cfg.cmd.action.Currency> currencys = new java.util.ArrayList<cfg.cmd.action.Currency>();
	public Currencys(cfg.DataStream fs) {
		super(fs);
		for(int n = fs.getInt(); n-- > 0 ; ) {
			this.currencys.add((cfg.cmd.action.Currency)cfg.DataStream.create("cfg.cmd.action.Currency", fs));
		}
	}
}