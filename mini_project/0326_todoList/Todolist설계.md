# TodoList 프로젝트 개발 설계

## 기획 개요

TodoList는 할 일을 관리하는 간단한 웹 애플리케이션으로, 사용자가 할 일을 추가하고 완료 상태를 토글할 수 있습니다. Vue 3를 사용하여 구현하며, 로컬 저장소를 활용하여 데이터를 저장하고 불러옵니다. 이를 통해 사용자가 페이지를 새로고침해도 데이터가 유지되도록 합니다.

## 핵심 기능 정의

1. **할 일 추가**: 사용자가 새로운 할 일을 입력하고 추가할 수 있음
2. **할 일 목록 표시**: 추가된 할 일들을 목록 형태로 보여줌
3. **할 일 상태 변경**: 완료/미완료 상태를 토글할 수 있음
4. **할 일 삭제**: 목록에서 할 일 항목을 삭제할 수 있음
5. **필터링**: 전체/완료/미완료 항목 필터링 기능
6. **로컬 저장소**: 브라우저 localStorage를 활용하여 데이터 유지

## Figma

https://www.figma.com/design/mNaSkdH3LupBlOfKQh5t9h/Todo-List-sample?node-id=0-1&t=7ewGPSUEO4uZnd6r-1

## 데이터 구조

```javascript
{
  todos: [
    {
      id: 1,                // 고유 식별자
      text: '할 일 내용',    // 할 일 텍스트
      completed: false,     // 완료 상태
      createdAt: Date       // 생성 시간
    },
    // ...
  ],
  newTodo: '',              // 새 할 일 입력값
  filter: 'all'             // 필터 상태 (all, active, completed)
}
```

## 컴포넌트 구조

단일 HTML 파일에 구현하므로 하나의 루트 컴포넌트에 모든 기능을 포함합니다:

1. **입력 폼**: 새 할 일 추가를 위한 입력 필드와 버튼
2. **필터 탭**: 전체/활성/완료된 할 일을 필터링하는 탭
3. **할 일 목록**: 할 일 항목들을 표시하는 목록
4. **할 일 항목**: 개별 할 일 표시, 완료 상태 토글, 삭제 기능
5. **요약 정보**: 남은 할 일 개수 표시, 완료된 항목 전체 삭제 버튼

## 세부 기능 설계

### 1. 할 일 추가

- 텍스트 입력 필드와 [추가하기] 버튼 제공
- 빈 입력값은 추가되지 않도록 유효성 검사
- 입력 후 엔터 키로도 추가 가능
- 추가 시 고유 ID 생성 (현재 시간 기반)

### 2. 할 일 표시

- 목록 형태로 할 일 항목 표시
- 각 항목은 체크박스, 텍스트, 삭제 버튼으로 구성
- 완료된 항목은 취소선으로 시각적 표시

### 3. 할 일 관리

- 체크박스로 완료/미완료 상태 토글
- 삭제 버튼으로 항목 제거
- 특정 필터 적용 시 해당 조건에 맞는 항목만 표시

### 4. 필터링

- [전체] [활성] [완료] 필터 버튼 제공
- 선택된 필터에 따라 목록 동적 변경
- 선택된 필터 버튼에 시각적 강조 표시

### 5. 요약 정보

- 남은 할 일 개수 표시
- 완료된 항목이 있을 경우 전체 삭제 버튼 표시

### 6. 로컬 저장소 활용

- localStorage에 todo 항목 저장
- 페이지 로드 시(mounted) 저장된 데이터 불러오기
- 데이터 변경 시 자동 저장
