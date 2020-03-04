package utilities

class UnionFind(n: Int) {
    private val parent = IntArray(n) { -1 }

    fun root(x: Int): Int {
        if (parent[x] < 0) return x
        parent[x] = root(parent[x])
        return parent[x]
    }

    fun isSameRoot(x: Int, y: Int) = root(x) == root(y)

    fun merge(x: Int, y: Int) {
        var xRoot = root(x)
        var yRoot = root(y)
        if (xRoot == yRoot) return
        if (parent[xRoot] > parent[yRoot]){
            val tmp = xRoot
            xRoot = yRoot
            yRoot = tmp
        }
        parent[xRoot] += parent[yRoot]
        parent[yRoot] = xRoot
    }

    fun groupSize(x: Int) = -parent[root(x)]

    override fun toString(): String {
        return parent.toString()
    }
}