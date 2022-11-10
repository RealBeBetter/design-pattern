package filter.filter;

import java.util.List;

/**
 * @author wei.song
 * @since 2022-11-10 18:15
 */
public interface Criteria {
    /**
     * 获得符合标准的Person
     *
     * @param persons 初始persons
     * @return 符合标准persons
     */
    List<Person> meetCriteria(List<Person> persons);
}
