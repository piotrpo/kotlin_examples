package pl.com.digita.kotlinexamples.encapsulation

class KPrintableGeometry(geometry: IGeometry, printAttributes: IPrintableGeometry) : IGeometry by geometry, IPrintableGeometry by printAttributes{

}