package tech.lewiszlw.statepattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import tech.lewiszlw.statepattern.state.State;

/**
 * Desc:
 * ------------------------------------
 * Author:zhanglinwei
 * Date:2018/10/22
 * Time:10:45
 */
@Data
@AllArgsConstructor
public class Context {

    private State state;

    public void request() {
        state.handle(this);
    }
}
