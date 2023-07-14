package a0714;

import a0713.Member;

@FunctionalInterface
public interface Creatable2 {
    public Member create(String id, String name);
}
