package {
public class PickVectorTypeInFlexIter {
    import mx.rpc.soap.AbstractWebService;

    public function foo() {
        var o:Object;

        <caret>
    }

    private function get bar():Vector.<AbstractWebService> {
        return null;
    }
}
}