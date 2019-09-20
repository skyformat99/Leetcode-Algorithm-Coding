所有 DNA 由一系列缩写为 A，C，G 和 T 的核苷酸组成，例如：“ACGAATTCCG”。在研究 DNA 时，识别 DNA 中的重复序列有时会对研究非常有帮助。

编写一个函数来查找 DNA 分子中所有出现超多一次的10个字母长的序列（子串）。

*示例*:

``输入: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"``

``输出: ["AAAAACCCCC", "CCCCCAAAAA"]``
``

## 方法 0：滑动窗口

1. 固定扫描长度10个字符
2. 从左到右扫描,列出全部组合
3. 筛选出符合条件的组合结果

```java
public List<String> findRepeatedDnaSequences(String s) {
        Set visited = new HashSet(), res = new HashSet();
        for (int i = 0; i + 10 <= s.length(); i++) {
            String tmp = s.substring(i, i + 10);
            if (visited.contains(tmp)) {
                res.add(tmp);
            } else {
                visited.add(tmp);
            }
        }
        return new ArrayList<>(res);
    }
```

 

