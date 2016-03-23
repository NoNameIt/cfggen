package cfg.cmd.condition;
public final class MultiCondition extends cfg.cmd.condition.Condition {
	public final static int TYPEID = 151824563;
	final public int getTypeId() { return TYPEID; }
	public final java.util.List<cfg.cmd.condition.Condition> conditions = new java.util.ArrayList<cfg.cmd.condition.Condition>();
	public MultiCondition(cfg.DataStream fs) {
		super(fs);
		for(int n = fs.getInt(); n-- > 0 ; ) {
			this.conditions.add((cfg.cmd.condition.Condition)cfg.DataStream.create(fs.getString(), fs));
		}
	}
}