package activity.minimal.example.activity.aspects;

import activity.minimal.example.activity.Root;
import java.util.Map;

@SuppressWarnings("all")
public class RootAspectRootAspectContext {
  public static final RootAspectRootAspectContext INSTANCE = new RootAspectRootAspectContext();
  
  public static RootAspectRootAspectProperties getSelf(final Root _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new activity.minimal.example.activity.aspects.RootAspectRootAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Root, RootAspectRootAspectProperties> map = new java.util.WeakHashMap<activity.minimal.example.activity.Root, activity.minimal.example.activity.aspects.RootAspectRootAspectProperties>();
  
  public Map<Root, RootAspectRootAspectProperties> getMap() {
    return map;
  }
}
