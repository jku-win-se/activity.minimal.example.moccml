package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Sequence;
import java.util.Map;

@SuppressWarnings("all")
public class SequenceAspectSequenceAspectContext {
  public static final SequenceAspectSequenceAspectContext INSTANCE = new SequenceAspectSequenceAspectContext();
  
  public static SequenceAspectSequenceAspectProperties getSelf(final Sequence _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new activity.minimal.example.activity.aspects.SequenceAspectSequenceAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Sequence, SequenceAspectSequenceAspectProperties> map = new java.util.WeakHashMap<activity.minimal.example.activity.Sequence, activity.minimal.example.activity.aspects.SequenceAspectSequenceAspectProperties>();
  
  public Map<Sequence, SequenceAspectSequenceAspectProperties> getMap() {
    return map;
  }
}
