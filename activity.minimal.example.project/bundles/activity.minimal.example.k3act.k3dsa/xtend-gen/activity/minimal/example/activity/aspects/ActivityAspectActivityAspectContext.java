package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Activity;
import java.util.Map;

@SuppressWarnings("all")
public class ActivityAspectActivityAspectContext {
  public static final ActivityAspectActivityAspectContext INSTANCE = new ActivityAspectActivityAspectContext();
  
  public static ActivityAspectActivityAspectProperties getSelf(final Activity _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new activity.minimal.example.activity.aspects.ActivityAspectActivityAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Activity, ActivityAspectActivityAspectProperties> map = new java.util.WeakHashMap<activity.minimal.example.activity.Activity, activity.minimal.example.activity.aspects.ActivityAspectActivityAspectProperties>();
  
  public Map<Activity, ActivityAspectActivityAspectProperties> getMap() {
    return map;
  }
}
