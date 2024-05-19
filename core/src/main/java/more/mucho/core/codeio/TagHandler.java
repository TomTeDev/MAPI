package more.mucho.core.codeio;

import java.util.List;

public interface TagHandler {


    boolean hasKey(String key);
    void removeKey(String key);
    List<String> getKeys();

}

