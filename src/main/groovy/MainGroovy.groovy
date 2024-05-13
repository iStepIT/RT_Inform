class MainGroovy {
    static void main(String[] args) {
        def list = [1, 3, 4, 5, 1, 5, 4]
        def result = countElements(list)
        println(result)
    }

    static def countElements(list) {
        if (list == null) return [:]

        def result = [:]
        list.each { element ->
            result[element] = result.getOrDefault(element, 0) + 1
        }
        return result
    }
}
